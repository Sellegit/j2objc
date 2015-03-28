package apple.webkit;


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
 * @since Available in iOS 8.0 and later.
 */
@Library("WebKit/WebKit.h")
@Mapping("WKSelectionGranularity")
public final class WKSelectionGranularity extends ObjCEnum {
    
    @GlobalConstant("WKSelectionGranularityDynamic")
    public static final long Dynamic = 0L;
    @GlobalConstant("WKSelectionGranularityCharacter")
    public static final long Character = 1L;


}
