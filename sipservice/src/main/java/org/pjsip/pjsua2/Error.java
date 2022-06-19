/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package org.pjsip.pjsua2;

public class Error extends java.lang.Exception {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected Error(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(Error obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        pjsua2JNI.delete_Error(swigCPtr);
      }
      swigCPtr = 0;
    }
  }


  // Override getMessage()
  public String getMessage() {
    return getTitle();
  }
  
  // Disable serialization (check ticket #1868)
  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    throw new java.io.NotSerializableException("Check ticket #1868!");
  }
  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException {
    throw new java.io.NotSerializableException("Check ticket #1868!");
  }


  public void setStatus(int value) {
    pjsua2JNI.Error_status_set(swigCPtr, this, value);
  }

  public int getStatus() {
    return pjsua2JNI.Error_status_get(swigCPtr, this);
  }

  public void setTitle(String value) {
    pjsua2JNI.Error_title_set(swigCPtr, this, value);
  }

  public String getTitle() {
    return pjsua2JNI.Error_title_get(swigCPtr, this);
  }

  public void setReason(String value) {
    pjsua2JNI.Error_reason_set(swigCPtr, this, value);
  }

  public String getReason() {
    return pjsua2JNI.Error_reason_get(swigCPtr, this);
  }

  public void setSrcFile(String value) {
    pjsua2JNI.Error_srcFile_set(swigCPtr, this, value);
  }

  public String getSrcFile() {
    return pjsua2JNI.Error_srcFile_get(swigCPtr, this);
  }

  public void setSrcLine(int value) {
    pjsua2JNI.Error_srcLine_set(swigCPtr, this, value);
  }

  public int getSrcLine() {
    return pjsua2JNI.Error_srcLine_get(swigCPtr, this);
  }

  public String info(boolean multi_line) {
    return pjsua2JNI.Error_info__SWIG_0(swigCPtr, this, multi_line);
  }

  public String info() {
    return pjsua2JNI.Error_info__SWIG_1(swigCPtr, this);
  }

  public Error() {
    this(pjsua2JNI.new_Error__SWIG_0(), true);
  }

  public Error(int prm_status, String prm_title, String prm_reason, String prm_src_file, int prm_src_line) {
    this(pjsua2JNI.new_Error__SWIG_1(prm_status, prm_title, prm_reason, prm_src_file, prm_src_line), true);
  }

}
