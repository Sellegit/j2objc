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
@Library("UIKit/UIKit.h") @Mapping("UIGuidedAccessRestrictionDelegate")
public interface UIGuidedAccessRestrictionDelegate 
    extends NSObjectProtocol {

    
    


    
    @Mapping("guidedAccessRestrictionIdentifiers")
    List<String> getIdentifiers();
    @Mapping("guidedAccessRestrictionWithIdentifier:didChangeState:")
    void didChangeState(String restrictionIdentifier, @Representing("UIGuidedAccessRestrictionState") long newRestrictionState);
    @Mapping("textForGuidedAccessRestrictionWithIdentifier:")
    String getText(String restrictionIdentifier);
    @Mapping("detailTextForGuidedAccessRestrictionWithIdentifier:")
    String getDetailText(String restrictionIdentifier);

    /*<adapter>*/
    /*</adapter>*/
}
