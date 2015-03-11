package apple.passkit;


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
import apple.addressbook.*;



/**
 * @since Available in iOS 8.0 and later.
 */


@Mapping("PKAddressField")
public final class PKAddressField extends ObjCEnum {
    
    @GlobalConstant("PKAddressFieldNone")
    public static final long None = 0L;
    @GlobalConstant("PKAddressFieldPostalAddress")
    public static final long PostalAddress = 1L;
    @GlobalConstant("PKAddressFieldPhone")
    public static final long Phone = 2L;
    @GlobalConstant("PKAddressFieldEmail")
    public static final long Email = 4L;
    @GlobalConstant("PKAddressFieldAll")
    public static final long All = 7L;
    

}
