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

@Library("Foundation/Foundation.h") @Mapping("NSComparisonPredicate")
public class NSComparisonPredicate 
    extends NSPredicate 
     {

    
    
    @Mapping("initWithLeftExpression:rightExpression:modifier:type:options:")
    public NSComparisonPredicate(NSExpression lhs, NSExpression rhs, @Representing("NSComparisonPredicateModifier") @MachineSizedUInt long modifier, @Representing("NSPredicateOperatorType") @MachineSizedUInt long type, @Representing("NSComparisonPredicateOptions") @MachineSizedUInt long options) { }
    @Mapping("initWithLeftExpression:rightExpression:customSelector:")
    public NSComparisonPredicate(NSExpression lhs, NSExpression rhs, Selector selector) { }
    @Mapping("init")
    public NSComparisonPredicate() { }
    
    
    @Mapping("predicateOperatorType")
    public native @Representing("NSPredicateOperatorType") @MachineSizedUInt long getPredicateOperatorType();
    @Mapping("comparisonPredicateModifier")
    public native @Representing("NSComparisonPredicateModifier") @MachineSizedUInt long getComparisonPredicateModifier();
    @Mapping("leftExpression")
    public native NSExpression getLeftExpression();
    @Mapping("rightExpression")
    public native NSExpression getRightExpression();
    @Mapping("customSelector")
    public native Selector getCustomSelector();
    @Mapping("options")
    public native @Representing("NSComparisonPredicateOptions") @MachineSizedUInt long getOptions();
    
    
    
    
    
}
