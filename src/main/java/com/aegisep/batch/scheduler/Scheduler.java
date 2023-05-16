package com.aegisep.batch.scheduler;

import com.aegisep.batch.jobs.BatchJob;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class Scheduler {
    private JobLauncher jobLauncher;
    private BatchJob batchJob;
    private int INDEX = 1;

    @Scheduled(fixedDelay = 1000 * 60)
    public void run1() {
        log.info("  fixedDelay 1 min " + INDEX ++ );
    }

    @Scheduled(fixedDelay = 1000 * 30)
    public void run2() {
        log.info("  fixedDelay  30 sec " + INDEX ++ );
    }
}
