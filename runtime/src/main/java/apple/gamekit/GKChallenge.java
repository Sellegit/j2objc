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
 */

@Library("GameKit/GameKit.h") @Mapping("GKChallenge")
public class GKChallenge 
    extends NSObject 
    implements NSCoding {

    
    
    public GKChallenge() {}
    
    
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("issuingPlayerID")
    public native String getIssuingPlayerID();
    /**
     * @since Available in iOS 6.0 and later.
     * @deprecated Deprecated in iOS 8.0.
     */
    @Deprecated
    @Mapping("receivingPlayerID")
    public native String getReceivingPlayerID();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("issuingPlayer")
    public native GKPlayer getIssuingPlayer();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("receivingPlayer")
    public native GKPlayer getReceivingPlayer();
    @Mapping("state")
    public native @Representing("GKChallengeState") @MachineSizedSInt long getState();
    @Mapping("issueDate")
    public native NSDate getIssueDate();
    @Mapping("completionDate")
    public native NSDate getCompletionDate();
    @Mapping("message")
    public native String getMessage();
    
    
    
    @Mapping("decline")
    public native void decline();
    @Mapping("loadReceivedChallengesWithCompletionHandler:")
    public static native void loadReceivedChallenges(Todo completionHandler);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
