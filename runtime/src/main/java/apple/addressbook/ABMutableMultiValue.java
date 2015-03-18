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
public class ABMutableMultiValue 
    extends ABMultiValue 
     {

    
    
    
    
    
    @GlobalFunction("ABMultiValueCreateMutable")
    public static native ABMutableMultiValue create(ABPropertyType type);
    @GlobalFunction("ABMultiValueCreateMutableCopy")
    public static native ABMutableMultiValue create(ABMultiValue multiValue);
    @GlobalFunction("ABMultiValueAddValueAndLabel")
    public static native boolean addValueAndLabel(ABMutableMultiValue multiValue, CFType value, String label, Todo outIdentifier);
    @GlobalFunction("ABMultiValueInsertValueAndLabelAtIndex")
    public static native boolean insertValueAndLabel(ABMutableMultiValue multiValue, CFType value, String label, @MachineSizedSInt long index, Todo outIdentifier);
    @GlobalFunction("ABMultiValueRemoveValueAndLabelAtIndex")
    public static native boolean removeValueAndLabel(ABMutableMultiValue multiValue, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceValueAtIndex")
    public static native boolean replaceValue(ABMutableMultiValue multiValue, CFType value, @MachineSizedSInt long index);
    @GlobalFunction("ABMultiValueReplaceLabelAtIndex")
    public static native boolean replaceLabel(ABMutableMultiValue multiValue, String label, @MachineSizedSInt long index);
    
}
