package apple.iad;


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
import apple.mediaplayer.*;
import apple.avkit.*;



/**
 * @since Available in iOS 6.0 and later.
 */

@Library("iAd/iAd.h")
@Mapping("ADAdType")
public final class ADAdType extends ObjCEnum {
    
    @GlobalConstant("ADAdTypeBanner")
    public static final long Banner = 0L;
    @GlobalConstant("ADAdTypeMediumRectangle")
    public static final long MediumRectangle = 1L;
    

}
