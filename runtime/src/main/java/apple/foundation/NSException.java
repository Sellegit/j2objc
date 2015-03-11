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





@Library("Foundation") @Mapping("NSException")
public class NSException 
    extends NSObject 
    implements NSCopying, NSCoding {

    
    
    @Mapping("initWithName:reason:userInfo:")
    public NSException(String aName, String aReason, NSDictionary<?, ?> aUserInfo) { }
    
    
    @Mapping("name")
    public native String getName();
    @Mapping("reason")
    public native String getReason();
    @Mapping("userInfo")
    public native NSDictionary<?, ?> getUserInfo();
    /**
     * @since Available in iOS 2.0 and later.
     */
    @Mapping("callStackReturnAddresses")
    public native NSArray<NSNumber> getCallStackReturnAddresses();
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("callStackSymbols")
    public native NSArray<NSString> getCallStackSymbols();
    
    
    
    @GlobalFunction("NSSetUncaughtExceptionHandler")
    private static native void setUncaughtExceptionHandler(FunctionPtr p0);
    
    @Mapping("raise")
    public native void raise();
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);
    @Mapping("encodeWithCoder:")
    public native void encode(NSCoder aCoder);
    
}
