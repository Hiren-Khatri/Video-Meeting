package app.khatrisoftwares.videomeeting.listeners;

import app.khatrisoftwares.videomeeting.models.User;

public interface UsersListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);

    void onMultipleUserAction(boolean isMultipleUsersSelected);
}
