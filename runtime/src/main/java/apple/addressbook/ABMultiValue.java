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
    extends Object 
     {

    
    public static final int InvalidIdentifier = -1;
    
    
    
    
    
    @GlobalFunction("ABMultiValueGetPropertyType")
    public static native ABPropertyType getPropertyType(ABMultiValueRef multiValue);
    @GlobalFunction("ABMultiValueGetCount")
    public static native @MachineSizedSInt long getCount(ABMultiValueRef multiValue);
    @GlobalFunction("ABMultiValueCopyValueAtIndex")
    public static native CFType getValue(ABMultiValueRef multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueCopyArrayOfAllValues")
    public static native List<CFType> getAllValues(ABMultiValueRef multiValue);
    @GlobalFunction("ABMultiValueCopyLabelAtIndex")
    public static native CFString getLabel(ABMultiValueRef multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetIndexForIdentifier")
    public static native @MachineSizedSInt long indexOf(ABMultiValueRef multiValue, int identifier);
    @GlobalFunction("ABMultiValueGetIdentifierAtIndex")
    public static native int getIdentifier(ABMultiValueRef multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueGetFirstIndexOfValue")
    public static native @MachineSizedSInt long indexOf(ABMultiValueRef multiValue, CFType value);
    
}
