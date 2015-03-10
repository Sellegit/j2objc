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
 * @since Available in iOS 7.0 and later.
 */

@Library("GameKit") @Mapping("GKTurnBasedExchangeReply")
public class GKTurnBasedExchangeReply 
    extends NSObject 
     {

    
    
    public GKTurnBasedExchangeReply() {}
    
    
    @Mapping("recipient")
    public native GKTurnBasedParticipant getRecipient();
    @Mapping("message")
    public native String getMessage();
    @Mapping("data")
    public native NSData getData();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("replyDate")
    public native NSDate getReplyDate();
    
    
    
    
    
}
