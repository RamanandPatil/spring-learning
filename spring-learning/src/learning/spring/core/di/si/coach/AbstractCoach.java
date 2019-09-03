package learning.spring.core.di.si.coach;

import learning.spring.core.di.common.services.FortuneService;

public abstract class AbstractCoach implements Coach {
    protected FortuneService fortuneService;
    protected String emailAddress;
    protected String teamName;

    public abstract FortuneService getFortuneService();

    public abstract void setFortuneService(FortuneService fortuneService);

    public abstract String getEmailAddress();

    public abstract void setEmailAddress(String emailAddress);

    public abstract String getTeamName();

    public abstract void setTeamName(String teamName);
}
