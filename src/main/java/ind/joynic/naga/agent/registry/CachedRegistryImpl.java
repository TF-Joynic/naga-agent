package ind.joynic.naga.agent.registry;

import indi.joynic.naga.lib.LookupKey;
import indi.joynic.naga.lib.lb.node.ServiceNode;

import java.util.List;

public class CachedRegistryImpl implements CachedRegistry {

    @Override
    public boolean register(LookupKey lookupKey, ServiceNode serviceNode) {
        return false;
    }


    @Override
    public List<ServiceNode> lookup(LookupKey lookupKey) {
        return null;
    }

    @Override
    public boolean evict(LookupKey lookupKey, ServiceNode serviceNode) {
        return false;
    }

    @Override
    public void clear() {

    }

}
