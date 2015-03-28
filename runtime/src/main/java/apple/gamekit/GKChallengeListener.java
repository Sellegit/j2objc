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


@Library("GameKit/GameKit.h") @Mapping("GKChallengeListener")
public interface GKChallengeListener 
    extends NSObjectProtocol {

    
    


    
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:wantsToPlayChallenge:")
    void wantsToPlayChallenge(GKPlayer player, GKChallenge challenge);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:didReceiveChallenge:")
    void didReceiveChallenge(GKPlayer player, GKChallenge challenge);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:didCompleteChallenge:issuedByFriend:")
    void didCompleteChallenge(GKPlayer player, GKChallenge challenge, GKPlayer friendPlayer);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("player:issuedChallengeWasCompleted:byFriend:")
    void issuedChallengeWasCompleted(GKPlayer player, GKChallenge challenge, GKPlayer friendPlayer);

    /*<adapter>*/
    /*</adapter>*/
}
