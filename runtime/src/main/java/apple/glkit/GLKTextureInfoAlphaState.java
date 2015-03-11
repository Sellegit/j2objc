package apple.glkit;


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
import apple.opengles.*;
import apple.uikit.*;
import apple.dispatch.*;



/**
 * @since Available in iOS 5.0 and later.
 */

@Library("GLKit")
@Mapping("GLKTextureInfoAlphaState")
public final class GLKTextureInfoAlphaState extends ObjCEnum {
    
    @GlobalConstant("GLKTextureInfoAlphaStateNone")
    public static final long None = 0L;
    @GlobalConstant("GLKTextureInfoAlphaStateNonPremultiplied")
    public static final long NonPremultiplied = 1L;
    @GlobalConstant("GLKTextureInfoAlphaStatePremultiplied")
    public static final long Premultiplied = 2L;
    

}
