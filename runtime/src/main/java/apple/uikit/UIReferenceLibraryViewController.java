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
 * @since Available in iOS 5.0 and later.
 */

@Library("UIKit") @Mapping("UIReferenceLibraryViewController")
public class UIReferenceLibraryViewController 
    extends UIViewController 
     {

    
    
    public UIReferenceLibraryViewController() {}
    @Mapping("initWithTerm:")
    public UIReferenceLibraryViewController(String term) { }
    @Mapping("initWithNibName:bundle:")
    public UIReferenceLibraryViewController(String nibNameOrNil, NSBundle nibBundleOrNil) { }
    
    
    
    
    
    
    @Mapping("dictionaryHasDefinitionForTerm:")
    public static native boolean dictionaryHasDefinitionForTerm(String term);
    
}
