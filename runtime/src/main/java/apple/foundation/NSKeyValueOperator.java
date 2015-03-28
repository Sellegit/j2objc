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

/*<javadoc>*/
/*</javadoc>*/
@Library("Foundation/Foundation.h")
public final class NSKeyValueOperator 
    extends Object 
     {

    
    
    
    
    
    @GlobalConstant("NSAverageKeyValueOperator")
    public static native NSString AverageValue();
    @GlobalConstant("NSCountKeyValueOperator")
    public static native NSString CountValue();
    @GlobalConstant("NSDistinctUnionOfArraysKeyValueOperator")
    public static native NSString DistinctUnionOfArraysValue();
    @GlobalConstant("NSDistinctUnionOfObjectsKeyValueOperator")
    public static native NSString DistinctUnionOfObjectsValue();
    @GlobalConstant("NSDistinctUnionOfSetsKeyValueOperator")
    public static native NSString DistinctUnionOfSetsValue();
    @GlobalConstant("NSMaximumKeyValueOperator")
    public static native NSString MaximumValue();
    @GlobalConstant("NSMinimumKeyValueOperator")
    public static native NSString MinimumValue();
    @GlobalConstant("NSSumKeyValueOperator")
    public static native NSString SumValue();
    @GlobalConstant("NSUnionOfArraysKeyValueOperator")
    public static native NSString UnionOfArraysValue();
    @GlobalConstant("NSUnionOfObjectsKeyValueOperator")
    public static native NSString UnionOfObjectsValue();
    @GlobalConstant("NSUnionOfSetsKeyValueOperator")
    public static native NSString UnionOfSetsValue();

}
