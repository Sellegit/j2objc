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





@Library("Foundation") @Mapping("NSNetService")
public class NSNetService 
    extends NSObject 
     {

    
    
    public NSNetService() {}
    @Mapping("initWithDomain:type:name:port:")
    public NSNetService(String domain, String type, String name, int port) { }
    @Mapping("initWithDomain:type:name:")
    public NSNetService(String domain, String type, String name) { }
    
    
    @Mapping("delegate")
    public native NSNetServiceDelegate getDelegate();
    public native void setDelegate(NSNetServiceDelegate v);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("includesPeerToPeer")
    public native boolean includesPeerToPeer();
    /**
     * @since Available in iOS 7.0 and later.
     */
    public native void setIncludesPeerToPeer(boolean v);
    @Mapping("name")
    public native String getName();
    @Mapping("type")
    public native String getType();
    @Mapping("domain")
    public native String getDomain();
    @Mapping("hostName")
    public native String getHostName();
    @Mapping("addresses")
    public native NSArray<NSData> getAddresses();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("port")
    public native @MachineSizedSInt long getPort();
    
    
    
    @Mapping("scheduleInRunLoop:forMode:")
    public native void scheduleInRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("removeFromRunLoop:forMode:")
    public native void removeFromRunLoop(NSRunLoop aRunLoop, String mode);
    @Mapping("publish")
    public native void publish();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("publishWithOptions:")
    public native void publish(@Representing("NSNetServiceOptions") @MachineSizedUInt long options);
    @Mapping("stop")
    public native void stop();
    @Mapping("resolveWithTimeout:")
    public native void resolve(double timeout);
    @Mapping("getInputStream:outputStream:")
    protected native boolean getStreams(Todo inputStream, Todo outputStream);
    @Mapping("setTXTRecordData:")
    public native boolean setTXTRecordData(NSData recordData);
    @Mapping("TXTRecordData")
    public native NSData getTXTRecordData();
    @Mapping("startMonitoring")
    public native void startMonitoring();
    @Mapping("stopMonitoring")
    public native void stopMonitoring();
    @Mapping("dictionaryFromTXTRecordData:")
    public static native NSDictionary<?, ?> getDictionaryFromTXTRecordData(NSData txtData);
    @Mapping("dataFromTXTRecordDictionary:")
    public static native NSData getDataFromTXTRecordDictionary(NSDictionary<?, ?> txtDictionary);
    
}
