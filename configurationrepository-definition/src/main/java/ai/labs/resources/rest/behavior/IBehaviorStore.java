package ai.labs.resources.rest.behavior;

import ai.labs.persistence.IResourceStore;
import ai.labs.resources.rest.behavior.model.BehaviorConfiguration;

import java.util.List;

/**
 * @author ginccc
 */
public interface IBehaviorStore extends IResourceStore<BehaviorConfiguration> {
    List<String> readBehaviorRuleNames(String id, Integer version, String filter, String order, Integer limit) throws ResourceStoreException, ResourceNotFoundException;
}
