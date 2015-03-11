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


@Mapping("PKPassType")
public final class PKPassType extends ObjCEnum {
    
    @GlobalConstant("PKPassTypeBarcode")
    public static final long Barcode = 0L;
    @GlobalConstant("PKPassTypePayment")
    public static final long Payment = 1L;
    @GlobalConstant("PKPassTypeAny")
    public static final long Any = -1L;
    

}
