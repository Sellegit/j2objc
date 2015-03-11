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





@Library("Foundation") @Mapping("NSPropertyListSerialization")
public class NSPropertyListSerialization 
    extends NSObject 
     {

    
    
    public NSPropertyListSerialization() {}
    
    
    
    
    
    
    @Mapping("propertyList:isValidForFormat:")
    public static native boolean isPropertyListValidForFormat(NSPropertyList plist, @Representing("NSPropertyListFormat") @MachineSizedUInt long format);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("dataWithPropertyList:format:options:error:")
    protected static native NSData getDataFromPropertyList(NSPropertyList plist, @Representing("NSPropertyListFormat") @MachineSizedUInt long format, @MachineSizedUInt long opt, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("writePropertyList:toStream:format:options:error:")
    protected static native @MachineSizedSInt long writePropertyListToStream(NSPropertyList plist, NSOutputStream stream, @Representing("NSPropertyListFormat") @MachineSizedUInt long format, @MachineSizedUInt long opt, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("propertyListWithData:options:format:error:")
    protected static native NSPropertyList getPropertyListFromData(NSData data, @MachineSizedUInt long opt, Todo format, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("propertyListWithStream:options:format:error:")
    protected static native NSPropertyList getPropertyListFromStream(NSInputStream stream, @MachineSizedUInt long opt, Todo format, Todo error);
    
}
