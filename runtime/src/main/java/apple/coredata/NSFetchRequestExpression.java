package apple.coredata;


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



/**
 * @since Available in iOS 3.0 and later.
 */

@Library("CoreData") @Mapping("NSFetchRequestExpression")
public class NSFetchRequestExpression 
    extends NSExpression 
     {

    
    
    public NSFetchRequestExpression() {}
    @Mapping("initWithExpressionType:")
    public NSFetchRequestExpression(@Representing("NSExpressionType") @MachineSizedUInt long type) { }
    
    
    @Mapping("requestExpression")
    public native NSExpression getRequestExpression();
    @Mapping("contextExpression")
    public native NSExpression getContextExpression();
    @Mapping("isCountOnlyRequest")
    public native boolean isCountOnlyRequest();
    
    
    
    @Mapping("expressionForFetch:context:countOnly:")
    public static native NSExpression create(NSExpression fetch, NSExpression context, boolean countFlag);
    
}
