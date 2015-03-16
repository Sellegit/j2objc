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
@Library("AddressBook/AddressBook.h")
public class ABMultiValue 
    extends CFType 
     {

    
    public static final int InvalidIdentifier = -1;
    
    
    
    
    
    @GlobalFunction("ABMultiValueGetPropertyType")
    public static native ABPropertyType getPropertyType(ABMultiValue multiValue);
    @GlobalFunction("ABMultiValueGetCount")
    public static native @MachineSizedSInt long getCount(ABMultiValue multiValue);
    @GlobalFunction("ABMultiValueCopyValueAtIndex")
    public static native CFType getValue(ABMultiValue multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueCopyArrayOfAllValues")
    public static native List<CFType> getAllValues(ABMultiValue multiValue);
    @GlobalFunction("ABMultiValueCopyLabelAtIndex")
    public static native CFString getLabel(ABMultiValue multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetIndexForIdentifier")
    public static native @MachineSizedSInt long indexOf(ABMultiValue multiValue, int identifier);
    @GlobalFunction("ABMultiValueGetIdentifierAtIndex")
    public static native int getIdentifier(ABMultiValue multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetFirstIndexOfValue")
    public static native @MachineSizedSInt long indexOf(ABMultiValue multiValue, CFType value);
    
}
