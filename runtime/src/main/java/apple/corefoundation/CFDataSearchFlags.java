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



/**
 * @since Available in iOS 4.0 and later.
 */


@Mapping("CFDataSearchFlags")
public final class CFDataSearchFlags extends ObjCEnum {
    
    @GlobalConstant("kCFDataSearchBackwards")
    public static final long Backwards = 1L;
    @GlobalConstant("kCFDataSearchAnchored")
    public static final long Anchored = 2L;
    

}
