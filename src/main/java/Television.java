import java.util.ArrayList;
import java.util.List;

/**
 * Represents a television with a list of channels. Provides functionalities
 * to add, remove, and manage channels, including tuning to specific channels,
 * swapping them, and toggling favorites.
 */
public class Television {

    /**
     * Factory default channels for reference. These channels are used to reset
     * the television to its factory settings.
     */
    private static Channel[] factoryChannels = {
            new Channel("RTP 1 HD", 54),
            new Channel("CM TV HD", 62),
            new Channel("SPORT.TV + HD", 78),
            new Channel("Canal 11 HD", 86),
            new Channel("Globo Portugal HD", 174),
            new Channel("TVI Reality HD", 182),
            new Channel("SIC Mulher HD", 190),
            new Channel("SIC Caras HD", 198),
            new Channel("SIC Radical HD", 206),
            new Channel("Discovery Channel HD", 470)
    };

    private List<Channel> channelList;
    private int currentPosition;

    /**
     * Constructs a new Television instance with factory default channels.
     */
    public Television() {
        // TODO:
        // Initialize channel list and put in factory settings:
        // implement and call factorSettings() method.

        // Then, implement the methods of this class by order
        // of appearance; remove these comments.

        // At some points of the code, you are suggested to test
        // the functionality of the class in the main program.
    }

    /**
     * Resets the television to its factory settings, clearing all channels and
     * loading the default set.
     */
    public void factorySettings() {
        // TODO
    }

    /**
     * Validates whether the given position is within the range of the channel list.
     *
     * @param position The position to validate.
     * @return {@code true} if the position is valid, otherwise {@code false}.
     */
    private boolean isPositionValid(int position) {
        // TODO
        return false;
    }

    /**
     * Checks if the television is tuned to a channel.
     *
     * @return {@code true} if a channel is currently tuned, otherwise {@code false}.
     */
    public boolean isTuned() {
        // TODO
        return false;
    }

    /**
     * Returns the number of channels currently available.
     *
     * @return The number of channels.
     */
    public int getNumberOfChannels() {
        // TODO
        return 0;
    }

    /**
     * Retrieves the channel at the specified position.
     *
     * @param position The position of the channel to retrieve.
     * @return The channel at the specified position, or {@code null} if the position is invalid.
     */
    public Channel getChannel(int position) {
        // TODO
        return null;
    }

    /**
     * Returns a string representation of the television, including the current position,
     * current channel, and the number of channels.
     *
     * @return A formatted string representing the television's state.
     */
    @Override
    public String toString() {
        // Print in the following format:
        // "Television[numberOfChannels=?, tunedChannel=?]"
        // If there is no tuned channel, it should read "None"; otherwise
        // use the channel's toString method.
        return "<TODO>";
    }

    // TODO: Test the "Show Status" option in the main program.

    /**
     * Generates a formatted list of all channels, showing their positions
     * (starting at 0). Example:
     * <code>
     *     0. [channel at pos 0]
     *     1. [channel at pos 0]
     *     ...
     * </code>
     *
     * @return A formatted string containing the list of channels.
     */
    public String channelList() {
        return "<TODO>";
    }

    // TODO: Test the "Show Channel List" option in the main program.

    /**
     * Tunes the television to the channel at the specified position.
     *
     * @param position The position of the channel to tune to.
     * @return {@code true} if the channel was successfully tuned, otherwise {@code false}.
     */
    public boolean tunePosition(int position) {
        // TODO
        return false;
    }

    // TODO: Test the "Tune Position" option in the main program.

    /**
     * Toggles the favorite status of the currently tuned channel.
     *
     * @return {@code true} if the favorite status was successfully toggled, otherwise {@code false}.
     */
    public boolean toggleFavorite() {
        // TODO
        return false;
    }

    // TODO: Test the "Toggle Favorite" option in the main program.

    /**
     * Adds a new channel to the television.
     * There cannot exist channels with the same frequency.
     *
     * @param channel The channel to add.
     * @return {@code true} if the channel was successfully added, otherwise {@code false}.
     */
    public boolean addChannel(Channel channel) {
        // TODO
        return false;
    }

    // TODO: Test the "Add Channel" option in the main program.

    /**
     * Removes the channel at the specified position.
     *
     * @param position The position of the channel to remove.
     * @return {@code true} if the channel was successfully removed, otherwise {@code false}.
     */
    public boolean removeChannel(int position) {
        // TODO
        return false;
    }

    // TODO: Test the "Remove Channel" option in the main program.

    /**
     * Swaps the positions of two channels in the list.
     *
     * @param position1 The position of the first channel.
     * @param position2 The position of the second channel.
     * @return {@code true} if the channels were successfully swapped, otherwise {@code false}.
     */
    public boolean swapChannels(int position1, int position2) {
        // TODO
        return false;
    }

    // TODO: Test the "Swap Channels" option in the main program.

    /**
     * Finds the position of a channel based on its name or partial name.
     *
     * @param nameQuery The name or partial name to search for.
     * @return The position of the channel if found, otherwise -1.
     */
    public int findChannelPosition(String nameQuery) {
        // TODO
        return -1;
    }

    // TODO: Test the "Find Channel" option in the main program.

    // TODO: Test the "Apply Factory Settings" option in the main program,
    //       after the addition and removal of channels.

}
