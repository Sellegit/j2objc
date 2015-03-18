package apple.gamekit;


import java.io.*;
import java.nio.*;
import java.util.*;
import com.google.j2objc.annotations.*;
import com.google.j2objc.runtime.*;
import com.google.j2objc.runtime.block.*;
import apple.audiotoolbox.*;
import apple.corefoundation.*;
import apple.coregraphics.*;
import apple.coreservices.*;
import apple.foundation.*;
import apple.uikit.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GameKit/GameKit.h") @Mapping("GKTurnBasedMatch")
public class GKTurnBasedMatch 
    extends NSObject 
     {

    
    
    @Mapping("init")
    public GKTurnBasedMatch() { }
    
    
    @Mapping("matchID")
    public native String getMatchID();
    @Mapping("creationDate")
    public native NSDate getCreationDate();
    @Mapping("participants")
    public native NSArray<GKTurnBasedParticipant> getParticipants();
    @Mapping("status")
    public native @Representing("GKTurnBasedMatchStatus") @MachineSizedSInt long getStatus();
    @Mapping("currentParticipant")
    public native GKTurnBasedParticipant getCurrentParticipant();
    @Mapping("matchData")
    public native NSData getMatchData();
    @Mapping("message")
    public native String getMessage();
    @Mapping("setMessage:")
    public native void setMessage(String v);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("matchDataMaximumSize")
    public native @MachineSizedUInt long getMatchDataMaximumSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("exchanges")
    public native NSArray<GKTurnBasedExchange> getExchanges();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("activeExchanges")
    public native NSArray<GKTurnBasedExchange> getActiveExchanges();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("completedExchanges")
    public native NSArray<GKTurnBasedExchange> getCompletedExchanges();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("exchangeDataMaximumSize")
    public native @MachineSizedUInt long getExchangeDataMaximumSize();
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("exchangeMaxInitiatedExchangesPerPlayer")
    public native @MachineSizedUInt long getExchangeMaxInitiatedExchangesPerPlayer();
    
    
    
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("GKTurnTimeoutDefault")
    public static native double getDefaultTimeout();
    /**
     * @since Available in iOS 6.0 and later.
     */
    @GlobalConstant("GKTurnTimeoutNone")
    public static native double getNoneTimeout();
    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("setLocalizableMessageWithKey:arguments:")
    public native void setLocalizableMessage(String key, NSArray<?> arguments);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("rematchWithCompletionHandler:")
    public native void rematch(@Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("acceptInviteWithCompletionHandler:")
    public native void acceptInvite(@Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("declineInviteWithCompletionHandler:")
    public native void declineInvite(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("removeWithCompletionHandler:")
    public native void remove(@Block VoidBlock1<NSError> completionHandler);
    @Mapping("loadMatchDataWithCompletionHandler:")
    public native void loadMatchData(@Block VoidBlock2<NSData, NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("endTurnWithNextParticipants:turnTimeout:matchData:completionHandler:")
    public native void endTurn(NSArray<?> nextParticipants, double timeout, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("participantQuitInTurnWithOutcome:nextParticipants:turnTimeout:matchData:completionHandler:")
    public native void participantQuitInTurn(@Representing("GKTurnBasedMatchOutcome") @MachineSizedSInt long matchOutcome, NSArray<?> nextParticipants, double timeout, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("participantQuitOutOfTurnWithOutcome:withCompletionHandler:")
    public native void participantQuitOutOfTurn(@Representing("GKTurnBasedMatchOutcome") @MachineSizedSInt long matchOutcome, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("endMatchInTurnWithMatchData:completionHandler:")
    public native void endMatch(NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("endMatchInTurnWithMatchData:scores:achievements:completionHandler:")
    public native void endMatch(NSData matchData, NSArray<?> scores, NSArray<?> achievements, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 6.0 and later.
     */
    @Mapping("saveCurrentTurnWithMatchData:completionHandler:")
    public native void saveCurrentTurn(NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("saveMergedMatchData:withResolvedExchanges:completionHandler:")
    public native void saveMergedMatchData(NSData matchData, NSArray<?> exchanges, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sendExchangeToParticipants:data:localizableMessageKey:arguments:timeout:completionHandler:")
    public native void sendExchange(NSArray<?> participants, NSData data, String key, NSArray<?> arguments, double timeout, @Block VoidBlock2<GKTurnBasedExchange, NSError> completionHandler);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("sendReminderToParticipants:localizableMessageKey:arguments:completionHandler:")
    public native void sendReminder(NSArray<?> participants, String key, NSArray<?> arguments, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("endTurnWithNextParticipant:matchData:completionHandler:")
    public native void endTurn(GKTurnBasedParticipant nextParticipant, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     * @deprecated Deprecated in iOS 6.0.
     */
    @Deprecated
    @Mapping("participantQuitInTurnWithOutcome:nextParticipant:matchData:completionHandler:")
    public native void participantQuitInTurn(@Representing("GKTurnBasedMatchOutcome") @MachineSizedSInt long matchOutcome, GKTurnBasedParticipant nextParticipant, NSData matchData, @Block VoidBlock1<NSError> completionHandler);
    @Mapping("findMatchForRequest:withCompletionHandler:")
    public static native void findMatch(GKMatchRequest request, @Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    @Mapping("loadMatchesWithCompletionHandler:")
    public static native void loadMatches(Todo completionHandler);
    /**
     * @since Available in iOS 5.0 and later.
     */
    @Mapping("loadMatchWithID:withCompletionHandler:")
    public static native void loadMatches(String matchID, @Block VoidBlock2<GKTurnBasedMatch, NSError> completionHandler);
    
}
