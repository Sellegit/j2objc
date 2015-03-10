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
@Library("CoreFoundation")
public class CFPropertyList 
    extends CFType 
     {

    
    
    
    
    
    @GlobalFunction("CFPropertyListCreateDeepCopy")
    public static native CFType createDeepCopy(CFAllocator allocator, CFType propertyList, CFPropertyListMutabilityOptions mutabilityOption);
    @GlobalFunction("CFPropertyListIsValid")
    public static native boolean isValid(CFType plist, CFPropertyListFormat format);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateWithData")
    public static native CFType createWithData(CFAllocator allocator, CFData data, CFPropertyListMutabilityOptions options, Todo format, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateWithStream")
    public static native CFType createWithStream(CFAllocator allocator, CFReadStream stream, @MachineSizedSInt long streamLength, CFPropertyListMutabilityOptions options, Todo format, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListWrite")
    public static native @MachineSizedSInt long write(CFType propertyList, CFWriteStream stream, CFPropertyListFormat format, CFPropertyListMutabilityOptions options, Todo error);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @GlobalFunction("CFPropertyListCreateData")
    public static native CFData createData(CFAllocator allocator, CFType propertyList, CFPropertyListFormat format, CFPropertyListMutabilityOptions options, Todo error);
    
}
