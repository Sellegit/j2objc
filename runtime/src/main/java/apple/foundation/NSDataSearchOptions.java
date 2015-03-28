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


/**
 * @since Available in iOS 4.0 and later.
 */
@Library("Foundation/Foundation.h")
@Mapping("NSDataSearchOptions")
public final class NSDataSearchOptions extends ObjCEnum {
    
    @GlobalConstant("NSDataSearchBackwards")
    public static final long Backwards = 1L;
    @GlobalConstant("NSDataSearchAnchored")
    public static final long Anchored = 2L;


}
