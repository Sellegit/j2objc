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


/*<javadoc>*/
/*</javadoc>*/
@Adapter
public abstract class UIGuidedAccessRestrictionDelegateAdapter 
    extends Object 
    implements UIGuidedAccessRestrictionDelegate {

    
    
    
    
    
    
    
    @NotImplemented("guidedAccessRestrictionIdentifiers")
    public List<String> getIdentifiers() { throw new UnsupportedOperationException(); }
    @NotImplemented("guidedAccessRestrictionWithIdentifier:didChangeState:")
    public void didChangeState(String restrictionIdentifier, @Representing("UIGuidedAccessRestrictionState") long newRestrictionState) { throw new UnsupportedOperationException(); }
    @NotImplemented("textForGuidedAccessRestrictionWithIdentifier:")
    public String getText(String restrictionIdentifier) { throw new UnsupportedOperationException(); }
    @NotImplemented("detailTextForGuidedAccessRestrictionWithIdentifier:")
    public String getDetailText(String restrictionIdentifier) { throw new UnsupportedOperationException(); }
    
}
