package apple.corefoundation;


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
import apple.dispatch.*;
import apple.foundation.*;


/*<javadoc>*/
/*</javadoc>*/
@Library("CoreFoundation/CoreFoundation.h")
public class CFPropertyList 
    extends Object 
     {

    
    
    
    
    
    @GlobalFunction("CFPropertyListCreateDeepCopy")
    public static native CFPropertyListRef createDeepCopy(CFAllocator allocator, CFPropertyListRef propertyList, @MachineSizedUInt long mutabilityOption);
    @GlobalFunction("CFPropertyListIsValid")
    public static native boolean isValid(CFPropertyListRef plist, @Representing("CFPropertyListFormat") long format);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateWithData")
    public static native CFPropertyListRef createWithData(CFAllocator allocator, CFData data, @MachineSizedUInt long options, Todo format, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateWithStream")
    public static native CFPropertyListRef createWithStream(CFAllocator allocator, CFReadStream stream, @MachineSizedSInt long streamLength, @MachineSizedUInt long options, Todo format, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListWrite")
    public static native @MachineSizedSInt long write(CFPropertyListRef propertyList, CFWriteStream stream, @Representing("CFPropertyListFormat") long format, @MachineSizedUInt long options, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateData")
    public static native CFData createData(CFAllocator allocator, CFPropertyListRef propertyList, @Representing("CFPropertyListFormat") long format, @MachineSizedUInt long options, Todo error);
    
}
