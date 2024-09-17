package org.alfresco.tutorial.scheduledjob.actions;

import org.alfresco.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.alfresco.tutorial.scheduledjob.reports.Orchestrator;

public class ScheduledJobExecuter {

    private static final Logger LOG = LoggerFactory.getLogger(ScheduledJobExecuter.class);

    /**
     * Public API access
     */
    private ServiceRegistry serviceRegistry;

    public void setServiceRegistry(ServiceRegistry serviceRegistry) {
        this.serviceRegistry = serviceRegistry;
    }

    /**
     * Executer implementation
     */
    public void execute() {
        LOG.info("Running the scheduled job");
        System.out.println("-----------------------> RUNNING JOB!");

        // Work/Job implementation starts from here...
        new Orchestrator().ping();

    }

}

