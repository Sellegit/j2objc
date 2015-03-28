package apple.uikit;


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
import apple.coreanimation.*;
import apple.coredata.*;
import apple.coreimage.*;
import apple.coretext.*;
import apple.corelocation.*;


/**
 * @since Available in iOS 7.0 and later.
 */
@Library("UIKit/UIKit.h")
@Mapping("NSTextWritingDirection")
public final class NSTextWritingDirection extends ObjCEnum {
    
    @GlobalConstant("NSTextWritingDirectionEmbedding")
    public static final long Embedding = 0L;
    @GlobalConstant("NSTextWritingDirectionOverride")
    public static final long Override = 2L;


}
