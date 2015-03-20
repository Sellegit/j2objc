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
public class ABRecord 
    extends Object 
     {

    
    public static final int InvalidID = -1;
    
    
    
    
    
    @GlobalFunction("ABRecordGetRecordID")
    public static native int getRecordID(ABRecordRef record);
    @GlobalFunction("ABRecordGetRecordType")
    public static native ABRecordType getRecordType(ABRecordRef record);
    @GlobalFunction("ABRecordCopyValue")
    public static native CFType getValue(ABRecordRef record, int property);
    @GlobalFunction("ABRecordSetValue")
    public static native boolean setValue(ABRecordRef record, int property, CFType value, Todo error);
    @GlobalFunction("ABRecordRemoveValue")
    public static native boolean removeValue(ABRecordRef record, int property, Todo error);
    @GlobalFunction("ABRecordCopyCompositeName")
    public static native String getCompositeName(ABRecordRef record);
    
}
