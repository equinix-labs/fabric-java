/*
 * Equinix Fabric API v4
 * Equinix Fabric is an advanced software-defined interconnection solution that enables you to directly, securely and dynamically connect to distributed infrastructure and digital ecosystems on platform Equinix via a single port, Customers can use Fabric to connect to: </br> 1. Cloud Service Providers - Clouds, network and other service providers.  </br> 2. Enterprises - Other Equinix customers, vendors and partners.  </br> 3. Myself - Another customer instance deployed at Equinix. </br>
 *
 * The version of the OpenAPI document: 4.6
 * Contact: api-support@equinix.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.equinix.openapi.fabric;

import okhttp3.MediaType;
import okhttp3.ResponseBody;

import java.io.IOException;

import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

public class ProgressResponseBody extends ResponseBody {

    private final ResponseBody responseBody;
    private final ApiCallback callback;
    private BufferedSource bufferedSource;

    public ProgressResponseBody(ResponseBody responseBody, ApiCallback callback) {
        this.responseBody = responseBody;
        this.callback = callback;
    }

    @Override
    public MediaType contentType() {
        return responseBody.contentType();
    }

    @Override
    public long contentLength() {
        return responseBody.contentLength();
    }

    @Override
    public BufferedSource source() {
        if (bufferedSource == null) {
            bufferedSource = Okio.buffer(source(responseBody.source()));
        }
        return bufferedSource;
    }

    private Source source(Source source) {
        return new ForwardingSource(source) {
            long totalBytesRead = 0L;

            @Override
            public long read(Buffer sink, long byteCount) throws IOException {
                long bytesRead = super.read(sink, byteCount);
                // read() returns the number of bytes read, or -1 if this source is exhausted.
                totalBytesRead += bytesRead != -1 ? bytesRead : 0;
                callback.onDownloadProgress(totalBytesRead, responseBody.contentLength(), bytesRead == -1);
                return bytesRead;
            }
        };
    }
}
