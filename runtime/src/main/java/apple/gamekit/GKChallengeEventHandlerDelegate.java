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
 * @since Available in iOS 6.0 and later.
 * @deprecated Deprecated in iOS 7.0.
 */
@Deprecated

@Library("GameKit/GameKit.h") @Mapping("GKChallengeEventHandlerDelegate")
public interface GKChallengeEventHandlerDelegate 
    extends NSObjectProtocol {

    
    
    
    
    
    @Mapping("localPlayerDidSelectChallenge:")
    void localPlayerDidSelectChallenge(GKChallenge challenge);
    @Mapping("shouldShowBannerForLocallyReceivedChallenge:")
    boolean shouldShowBannerForLocallyReceivedChallenge(GKChallenge challenge);
    @Mapping("localPlayerDidReceiveChallenge:")
    void localPlayerDidReceiveChallenge(GKChallenge challenge);
    @Mapping("shouldShowBannerForLocallyCompletedChallenge:")
    boolean shouldShowBannerForLocallyCompletedChallenge(GKChallenge challenge);
    @Mapping("localPlayerDidCompleteChallenge:")
    void localPlayerDidCompleteChallenge(GKChallenge challenge);
    @Mapping("shouldShowBannerForRemotelyCompletedChallenge:")
    boolean shouldShowBannerForRemotelyCompletedChallenge(GKChallenge challenge);
    @Mapping("remotePlayerDidCompleteChallenge:")
    void remotePlayerDidCompleteChallenge(GKChallenge challenge);
    
    /*<adapter>*/
    /*</adapter>*/
}
