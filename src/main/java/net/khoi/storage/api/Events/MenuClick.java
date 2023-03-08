package net.khoi.storage.api.Events;

import net.khoi.storage.api.Gui.Action.Action;
import net.khoi.storage.api.Gui.MainGui.Icon;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
/**
 * This event will be called when player click in plugin menu
 */
@SuppressWarnings("unused")
public class MenuClick extends StoragePlayerEvent {
    private final Inventory menu;
    private final int slot;
    private final Icon icon;
    private final Icon.Click click;
    private Action action;

    /**
     * Constructor method
     * @param player Player clicked the menu
     * @param menu Menu as inventory was clicked by player
     * @param slot Slot was clicked by player
     * @param action Action will be executed when player click in icon
     * @param icon The icon was clicked by player
     * @param click Click type of this event
     */
    public MenuClick(Player player, Inventory menu, int slot, Action action, Icon icon, Icon.Click click) {
        super(player);
        this.slot = slot;
        this.action = action;
        this.menu = menu;
        this.icon = icon;
        this.click = click;
    }

    /**
     * Get menu was clicked by player
     * @return Menu
     */
    public Inventory getMenu() {
        return menu;
    }

    /**
     * Get the slot was clicked by player
     * @return Slot as integer
     */
    public int getSlot() {
        return slot;
    }

    /**
     * Get action will be executed
     * @return Action
     */
    public Action getAction() {
        return action;
    }

    /**
     * Get icon was clicked by player
     * @return Icon
     */
    public Icon getIcon() {
        return icon;
    }

    /**
     * Get the click type of this event
     * @return Icon Click
     */
    public Icon.Click getClick() {
        return click;
    }

    /**
     * Set the action will be executed
     * @param action Action to set
     */
    public void setAction(Action action) {
        this.action = action;
    }
}
