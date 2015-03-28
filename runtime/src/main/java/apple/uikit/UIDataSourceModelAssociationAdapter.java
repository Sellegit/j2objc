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
public abstract class UIDataSourceModelAssociationAdapter 
    extends Object 
    implements UIDataSourceModelAssociation {

    
    
    


    
    
    @NotImplemented("modelIdentifierForElementAtIndexPath:inView:")
    public String getElementModelIdentifier(NSIndexPath idx, UIView view) { throw new UnsupportedOperationException(); }
    @NotImplemented("indexPathForElementWithModelIdentifier:inView:")
    public NSIndexPath getElementIndexPath(String identifier, UIView view) { throw new UnsupportedOperationException(); }

}
