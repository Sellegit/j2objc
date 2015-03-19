package apple.foundation;


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
import apple.uikit.*;
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coremedia.*;
import apple.security.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 7.0 and later.
 */

@Library("Foundation/Foundation.h") @Mapping("NSURLSessionTask")
public class NSURLSessionTask 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSURLSessionTask() { }
    
    
    @Mapping("taskIdentifier")
    public native @MachineSizedUInt long getTaskIdentifier();
    @Mapping("originalRequest")
    public native NSURLRequest getOriginalRequest();
    @Mapping("currentRequest")
    public native NSURLRequest getCurrentRequest();
    @Mapping("response")
    public native NSURLResponse getResponse();
    @Mapping("countOfBytesReceived")
    public native long getCountOfBytesReceived();
    @Mapping("countOfBytesSent")
    public native long getCountOfBytesSent();
    @Mapping("countOfBytesExpectedToSend")
    public native long getCountOfBytesExpectedToSend();
    @Mapping("countOfBytesExpectedToReceive")
    public native long getCountOfBytesExpectedToReceive();
    @Mapping("taskDescription")
    public native String getTaskDescription();
    @Mapping("setTaskDescription:")
    public native void setTaskDescription(String v);
    @Mapping("state")
    public native @Representing("NSURLSessionTaskState") long getState();
    @Mapping("error")
    public native NSError getError();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("priority")
    public native float getPriority();
    /**
     * @since Available in iOS 8.0 and later.
     */
    @Mapping("setPriority:")
    public native void setPriority(float v);
    
    
    
    @Mapping("cancel")
    public native void cancel();
    @Mapping("suspend")
    public native void suspend();
    @Mapping("resume")
    public native void resume();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    
}
