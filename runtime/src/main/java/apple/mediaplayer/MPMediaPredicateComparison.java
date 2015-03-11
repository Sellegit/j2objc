package apple.mediaplayer;


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
 * @since Available in iOS 3.0 and later.
 */

@Library("MediaPlayer")
@Mapping("MPMediaPredicateComparison")
public final class MPMediaPredicateComparison extends ObjCEnum {
    
    @GlobalConstant("MPMediaPredicateComparisonEqualTo")
    public static final long EqualTo = 0L;
    @GlobalConstant("MPMediaPredicateComparisonContains")
    public static final long Contains = 1L;
    

}
