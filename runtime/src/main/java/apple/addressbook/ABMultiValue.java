package apple.addressbook;


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


/*<javadoc>*/
/*</javadoc>*/
@Library("AddressBook")
public class ABMultiValue 
    extends CFType 
     {

    
    public static final int InvalidIdentifier = -1;
    
    
    
    
    
    @GlobalFunction("ABMultiValueGetPropertyType")
    public native ABPropertyType getPropertyType();
    @GlobalFunction("ABMultiValueGetCount")
    public native @MachineSizedSInt long getCount();
    @GlobalFunction("ABMultiValueCopyValueAtIndex")
    public native CFType getValue(@MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueCopyArrayOfAllValues")
    public native List<CFType> getAllValues();
    @GlobalFunction("ABMultiValueCopyLabelAtIndex")
    public native CFString getLabel(@MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetIndexForIdentifier")
    public native @MachineSizedSInt long indexOf(int identifier);
    @GlobalFunction("ABMultiValueGetIdentifierAtIndex")
    public native int getIdentifier(@MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetFirstIndexOfValue")
    public native @MachineSizedSInt long indexOf(CFType value);
    
}
