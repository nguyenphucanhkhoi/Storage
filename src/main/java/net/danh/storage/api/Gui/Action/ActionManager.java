package net.danh.storage.api.Gui.Action;

import java.util.List;

@SuppressWarnings("unused")
public interface ActionManager {
    /**
     * Register custom action
     * @param action Action to register
     */
    void register(Action action);

    /**
     * Unregister custom action
     * @param action Action to unregister
     * @param identifier Unique name of custom command
     * if it duplicates this will be replaced
     */
    void unRegister(Action action, String identifier);

    /**
     * Unregister custom action with specific identifier
     * @param identifier identifier of action to unregister
     */
    void unRegister(String identifier);

    /**
     * Unregister all registered actions
     */
    void unRegisterAll();

    /**
     * Get list of registered actions
     * @return List of all actions
     */
    List<Action> getRegistered();
}
