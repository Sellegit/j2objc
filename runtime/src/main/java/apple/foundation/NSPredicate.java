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
 * @since Available in iOS 3.0 and later.
 */
@Library("Foundation/Foundation.h") @Mapping("NSPredicate")
public class NSPredicate 
    extends NSObject 
    implements NSCopying {

    
    
    @Mapping("init")
    public NSPredicate() { }

    
    @Mapping("predicateFormat")
    public native String getPredicateFormat();

    
    
    @Mapping("predicateWithSubstitutionVariables:")
    public native NSPredicate newPredicateWithSubstitutionVariables(NSDictionary<?, ?> variables);
    @Mapping("evaluateWithObject:")
    public native boolean evaluate(Object object);
    /**
     * @since Available in iOS 3.0 and later.
     */
    @Mapping("evaluateWithObject:substitutionVariables:")
    public native boolean evaluate(Object object, NSDictionary<?, ?> bindings);
    /**
     * @since Available in iOS 7.0 and later.
     */
    @Mapping("allowEvaluation")
    public native void allowEvaluation();
    @Mapping("predicateWithFormat:argumentArray:")
    public static native NSPredicate create(String predicateFormat, NSArray<?> arguments);
    @Mapping("predicateWithValue:")
    public static native NSPredicate create(boolean value);
    /**
     * @since Available in iOS 4.0 and later.
     */
    @Mapping("predicateWithBlock:")
    public static native NSPredicate create(Todo block);
    @Mapping("copyWithZone:")
    public native Object copyWithZone$(NSZone zone);

}
