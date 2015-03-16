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

@Library("MediaPlayer/MediaPlayer.h") @Mapping("MPMediaPropertyPredicate")
public class MPMediaPropertyPredicate 
    extends MPMediaPredicate 
     {

    
    
    public MPMediaPropertyPredicate() {}
    
    
    @Mapping("property")
    public native NSString getPropertyName();
    @Mapping("value")
    public native Object getValue();
    @Mapping("comparisonType")
    public native @Representing("MPMediaPredicateComparison") @MachineSizedSInt long getComparisonType();
    
    
    
    @Mapping("predicateWithValue:forProperty:")
    protected static native MPMediaPropertyPredicate create(Object value, String property);
    @Mapping("predicateWithValue:forProperty:comparisonType:")
    protected static native MPMediaPropertyPredicate create(Object value, String property, @Representing("MPMediaPredicateComparison") @MachineSizedSInt long comparisonType);
    
}
