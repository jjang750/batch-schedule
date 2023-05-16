package com.aegisep.batch.utils;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BatchShutdownHandler implements Runnable{
    @Override
    public void run() {
        log.error(" Batch JOB is Down!! ");
    }
}
