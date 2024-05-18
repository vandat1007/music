package com.example.myapplication.Generic.Download.internal;

import com.example.myapplication.Generic.Download.Response;
import com.example.myapplication.Generic.Download.request.DownloadRequest;

public class SynchronousCall {

    public final DownloadRequest request;

    public SynchronousCall(DownloadRequest request) {
        this.request = request;
    }

    public Response execute() {
        DownloadTask downloadTask = DownloadTask.create(request);
        return downloadTask.run();
    }

}
