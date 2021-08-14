package com.machipopo.media17.modules.logevent.interfaces

enum class Page(var pageName: String) {
    NONE("none"),
    CURRENT("current"),
    MAIN_TABBAR("MainTabbar"),
    SIGN_UP_GUIDE("Signup_Guide"),
    LIVESTREAM_LIVE_SCREEN("Livestream_LiveScreen"),
    NAME_CARD("NameCard"),
    LIVESTREAM_ENVELOP_GRAB("Livestream_Envelope.Grab"), LIVESTREAM_ENVELOP_RESULT(
        "Livestream_Envelope.Result"
    ),
    LIVESTREAM_ENVELOP_GRABBED_ERROR(
        "Livestream_Envelope.Grabbed.Error"
    ),
    LIVESTREAM_VIDEO_CALL("Livestream_VideoCall"), LIVESTREAM_VIDEO_CALL_REMINDER(
        "Livestream_VideoCall.Reminder"
    ),
    LIVESTREAM_VIDEO_CALL_HANGUP_DIALOG(
        "Livestream_VideoCall.HangUp.Dialog"
    ),
    LIVESTREAM_SNACK_INFO("Livestream_Snack.Info"), LIVESTREAM_POKED_BACK(
        "Livestream_PokedBack"
    ),
    LIVESTREAM_MORE(
        "Livestream_More"
    ),
    LIVESTREAM_FOLLOW_ENCOURAGE_DIALOG("Livestream_FollowEncourage.Dialog"), LIVESTREAM_IAP_ENCOURAGE_DIALOG(
        "Livestream_IAPEncourage.Dialog"
    ),
    Livestream_17GOGOGO("Livestream_17gogo"), Livestream_17GOGOGO_INFO(
        "Livestream_17gogo.Info"
    ),
    HELP("Help"), HOT_OPT("Live_HotpageV2"), LIVESTREAM_STREAMER_DASHBOARD(
        "Livestream_StreamerDashboard"
    ),

    // HOT page
    MYFOLLOW_ROOT("MyFollow.Root"),
    MYFOLLOW_RECOMMEND("MyFollow.Recommend"), MYFOLLOW_STREAMING(
        "MyFollow.Streaming"
    ),
    MYFOLLOW_STREAMING_RECOMMEND("MyFollow.Streaming.Recommend"), MYFOLLOW_FOLLOWING(
        "MyFollow.Following"
    ),
    MYFOLLOW_WATCHED("MyFollow.Watched"), MYFOLLOW_FORYOU("MyFollow.Foryou"),

    // Announcement
    EVENT_ANNOUNCEMENT("EventAnnouncement"),

    // Leaderboard related page name
    LEADERBOARD_LEADERBOARD_RECEIVEDGIFT("Leaderboard_Leaderboard.ReceivedGift"), LEADERBOARD_LEADERBOARD_SENDGIFT(
        "Leaderboard_Leaderboard.SendGift"
    ),
    LEADERBOARD_LEADERBOARD_NORMALCRAZYSTAIRS("Leaderboard_Leaderboard.NormalCrazyStairs"), LEADERBOARD_LEADERBOARD_EXPERTCRAZYSTAIRS(
        "Leaderboard_Leaderboard.ExpertCrazyStairs"
    ),
    LEADERBOARD_LEADERBOARD_AMUSINGCRAZYSTAIRS("Leaderboard_Leaderboard.AmusingCrazyStairs"), LEADERBOARD_LEADERBOARD_SNACK(
        "Leaderboard_Leaderboard.Snack"
    ),
    LEADERBOARD_LEADERBOARD_STREAMERGLORYROAD("Leaderboard_Leaderboard.StreamerGloryRoad"), LEADERBOARD_LEADERBOARD_STREAMDURATION(
        "Leaderboard_Leaderboard.StreamDuration"
    ),
    LEADERBOARD_LEADERBOARD_ARMY("Leaderboard_Leaderboard.Army"), LEADERBOARD_LEADERBOARD_LIKES(
        "Leaderboard_Leaderboard.Likes"
    ),

    LEADERBOARD_LEADERBOARD_CREW("Leaderboard_Leaderboard.Crew"), LEADERBOARD_LEADERBOARD_STREAMEVENT(
        "Leaderboard_Leaderboard.StreamEvent"
    ),
    LEADERBOARD_LEADERBOARD_LEAGUE("Leaderboard_Leaderboard.League"), LEADERBOARD_LEADERBOARD_GAMEGIFT(
        "Leaderboard_Leaderboard.GameGift"
    ),
    LEADERBOARD_LEADERBOARD_PK("Leaderboard_Leaderboard.PK"), LEADERBOARD_LEADERBOARD_AVATAR_CHARM(
        "Leaderboard_Leaderboard.Avatar"
    ),
    DIALOG_SCHEDULEDSTREAM(
        "Dialog_ScheduledStream"
    ),

}