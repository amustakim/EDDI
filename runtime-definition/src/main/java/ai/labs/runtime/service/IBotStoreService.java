package ai.labs.runtime.service;

import ai.labs.resources.rest.bots.model.BotConfiguration;

/**
 * @author ginccc
 */
public interface IBotStoreService {
    BotConfiguration getBotConfiguration(String botId, Integer version) throws ServiceException;
}
