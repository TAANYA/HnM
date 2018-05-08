/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.5
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.chilkatsoft;

public class CkCompression {
  private long swigCPtr;
  protected boolean swigCMemOwn;

  protected CkCompression(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CkCompression obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        chilkatJNI.delete_CkCompression(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public CkCompression() {
    this(chilkatJNI.new_CkCompression(), true);
  }

  public void LastErrorXml(CkString str) {
    chilkatJNI.CkCompression_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorHtml(CkString str) {
    chilkatJNI.CkCompression_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void LastErrorText(CkString str) {
    chilkatJNI.CkCompression_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public void put_EventCallbackObject(CkBaseProgress progress) {
    chilkatJNI.CkCompression_put_EventCallbackObject(swigCPtr, this, CkBaseProgress.getCPtr(progress), progress);
  }

  public void get_Algorithm(CkString str) {
    chilkatJNI.CkCompression_get_Algorithm(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String algorithm() {
    return chilkatJNI.CkCompression_algorithm(swigCPtr, this);
  }

  public void put_Algorithm(String newVal) {
    chilkatJNI.CkCompression_put_Algorithm(swigCPtr, this, newVal);
  }

  public void get_Charset(CkString str) {
    chilkatJNI.CkCompression_get_Charset(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String charset() {
    return chilkatJNI.CkCompression_charset(swigCPtr, this);
  }

  public void put_Charset(String newVal) {
    chilkatJNI.CkCompression_put_Charset(swigCPtr, this, newVal);
  }

  public void get_DebugLogFilePath(CkString str) {
    chilkatJNI.CkCompression_get_DebugLogFilePath(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String debugLogFilePath() {
    return chilkatJNI.CkCompression_debugLogFilePath(swigCPtr, this);
  }

  public void put_DebugLogFilePath(String newVal) {
    chilkatJNI.CkCompression_put_DebugLogFilePath(swigCPtr, this, newVal);
  }

  public void get_EncodingMode(CkString str) {
    chilkatJNI.CkCompression_get_EncodingMode(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String encodingMode() {
    return chilkatJNI.CkCompression_encodingMode(swigCPtr, this);
  }

  public void put_EncodingMode(String newVal) {
    chilkatJNI.CkCompression_put_EncodingMode(swigCPtr, this, newVal);
  }

  public int get_HeartbeatMs() {
    return chilkatJNI.CkCompression_get_HeartbeatMs(swigCPtr, this);
  }

  public void put_HeartbeatMs(int newVal) {
    chilkatJNI.CkCompression_put_HeartbeatMs(swigCPtr, this, newVal);
  }

  public void get_LastErrorHtml(CkString str) {
    chilkatJNI.CkCompression_get_LastErrorHtml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorHtml() {
    return chilkatJNI.CkCompression_lastErrorHtml(swigCPtr, this);
  }

  public void get_LastErrorText(CkString str) {
    chilkatJNI.CkCompression_get_LastErrorText(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorText() {
    return chilkatJNI.CkCompression_lastErrorText(swigCPtr, this);
  }

  public void get_LastErrorXml(CkString str) {
    chilkatJNI.CkCompression_get_LastErrorXml(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String lastErrorXml() {
    return chilkatJNI.CkCompression_lastErrorXml(swigCPtr, this);
  }

  public boolean get_LastMethodSuccess() {
    return chilkatJNI.CkCompression_get_LastMethodSuccess(swigCPtr, this);
  }

  public void put_LastMethodSuccess(boolean newVal) {
    chilkatJNI.CkCompression_put_LastMethodSuccess(swigCPtr, this, newVal);
  }

  public boolean get_VerboseLogging() {
    return chilkatJNI.CkCompression_get_VerboseLogging(swigCPtr, this);
  }

  public void put_VerboseLogging(boolean newVal) {
    chilkatJNI.CkCompression_put_VerboseLogging(swigCPtr, this, newVal);
  }

  public void get_Version(CkString str) {
    chilkatJNI.CkCompression_get_Version(swigCPtr, this, CkString.getCPtr(str), str);
  }

  public String version() {
    return chilkatJNI.CkCompression_version(swigCPtr, this);
  }

  public boolean BeginCompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_BeginCompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask BeginCompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_BeginCompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginCompressBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_BeginCompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String beginCompressBytesENC(CkByteData data) {
    return chilkatJNI.CkCompression_beginCompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask BeginCompressBytesENCAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_BeginCompressBytesENCAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginCompressString(String str, CkByteData outData) {
    return chilkatJNI.CkCompression_BeginCompressString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public CkTask BeginCompressStringAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_BeginCompressStringAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginCompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCompression_BeginCompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String beginCompressStringENC(String str) {
    return chilkatJNI.CkCompression_beginCompressStringENC(swigCPtr, this, str);
  }

  public CkTask BeginCompressStringENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_BeginCompressStringENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginDecompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_BeginDecompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask BeginDecompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_BeginDecompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginDecompressBytesENC(String str, CkByteData outData) {
    return chilkatJNI.CkCompression_BeginDecompressBytesENC(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public CkTask BeginDecompressBytesENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_BeginDecompressBytesENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginDecompressString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_BeginDecompressString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String beginDecompressString(CkByteData data) {
    return chilkatJNI.CkCompression_beginDecompressString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask BeginDecompressStringAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_BeginDecompressStringAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean BeginDecompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCompression_BeginDecompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String beginDecompressStringENC(String str) {
    return chilkatJNI.CkCompression_beginDecompressStringENC(swigCPtr, this, str);
  }

  public CkTask BeginDecompressStringENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_BeginDecompressStringENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_CompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask CompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_CompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_CompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String compressBytesENC(CkByteData data) {
    return chilkatJNI.CkCompression_compressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask CompressBytesENCAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_CompressBytesENCAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressFile(String srcPath, String destPath) {
    return chilkatJNI.CkCompression_CompressFile(swigCPtr, this, srcPath, destPath);
  }

  public CkTask CompressFileAsync(String srcPath, String destPath) {
    long cPtr = chilkatJNI.CkCompression_CompressFileAsync(swigCPtr, this, srcPath, destPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressStream(CkStream strm) {
    return chilkatJNI.CkCompression_CompressStream(swigCPtr, this, CkStream.getCPtr(strm), strm);
  }

  public CkTask CompressStreamAsync(CkStream strm) {
    long cPtr = chilkatJNI.CkCompression_CompressStreamAsync(swigCPtr, this, CkStream.getCPtr(strm), strm);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressString(String str, CkByteData outData) {
    return chilkatJNI.CkCompression_CompressString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public CkTask CompressStringAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_CompressStringAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean CompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCompression_CompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String compressStringENC(String str) {
    return chilkatJNI.CkCompression_compressStringENC(swigCPtr, this, str);
  }

  public CkTask CompressStringENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_CompressStringENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_DecompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask DecompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_DecompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressBytesENC(String encodedCompressedData, CkByteData outData) {
    return chilkatJNI.CkCompression_DecompressBytesENC(swigCPtr, this, encodedCompressedData, CkByteData.getCPtr(outData), outData);
  }

  public CkTask DecompressBytesENCAsync(String encodedCompressedData) {
    long cPtr = chilkatJNI.CkCompression_DecompressBytesENCAsync(swigCPtr, this, encodedCompressedData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressFile(String srcPath, String destPath) {
    return chilkatJNI.CkCompression_DecompressFile(swigCPtr, this, srcPath, destPath);
  }

  public CkTask DecompressFileAsync(String srcPath, String destPath) {
    long cPtr = chilkatJNI.CkCompression_DecompressFileAsync(swigCPtr, this, srcPath, destPath);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressStream(CkStream strm) {
    return chilkatJNI.CkCompression_DecompressStream(swigCPtr, this, CkStream.getCPtr(strm), strm);
  }

  public CkTask DecompressStreamAsync(CkStream strm) {
    long cPtr = chilkatJNI.CkCompression_DecompressStreamAsync(swigCPtr, this, CkStream.getCPtr(strm), strm);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_DecompressString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String decompressString(CkByteData data) {
    return chilkatJNI.CkCompression_decompressString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask DecompressStringAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_DecompressStringAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean DecompressStringENC(String encodedCompressedData, CkString outStr) {
    return chilkatJNI.CkCompression_DecompressStringENC(swigCPtr, this, encodedCompressedData, CkString.getCPtr(outStr), outStr);
  }

  public String decompressStringENC(String encodedCompressedData) {
    return chilkatJNI.CkCompression_decompressStringENC(swigCPtr, this, encodedCompressedData);
  }

  public CkTask DecompressStringENCAsync(String encodedCompressedData) {
    long cPtr = chilkatJNI.CkCompression_DecompressStringENCAsync(swigCPtr, this, encodedCompressedData);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndCompressBytes(CkByteData outData) {
    return chilkatJNI.CkCompression_EndCompressBytes(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public CkTask EndCompressBytesAsync() {
    long cPtr = chilkatJNI.CkCompression_EndCompressBytesAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndCompressBytesENC(CkString outStr) {
    return chilkatJNI.CkCompression_EndCompressBytesENC(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String endCompressBytesENC() {
    return chilkatJNI.CkCompression_endCompressBytesENC(swigCPtr, this);
  }

  public CkTask EndCompressBytesENCAsync() {
    long cPtr = chilkatJNI.CkCompression_EndCompressBytesENCAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndCompressString(CkByteData outData) {
    return chilkatJNI.CkCompression_EndCompressString(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public CkTask EndCompressStringAsync() {
    long cPtr = chilkatJNI.CkCompression_EndCompressStringAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndCompressStringENC(CkString outStr) {
    return chilkatJNI.CkCompression_EndCompressStringENC(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String endCompressStringENC() {
    return chilkatJNI.CkCompression_endCompressStringENC(swigCPtr, this);
  }

  public CkTask EndCompressStringENCAsync() {
    long cPtr = chilkatJNI.CkCompression_EndCompressStringENCAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndDecompressBytes(CkByteData outData) {
    return chilkatJNI.CkCompression_EndDecompressBytes(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public CkTask EndDecompressBytesAsync() {
    long cPtr = chilkatJNI.CkCompression_EndDecompressBytesAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndDecompressBytesENC(CkByteData outData) {
    return chilkatJNI.CkCompression_EndDecompressBytesENC(swigCPtr, this, CkByteData.getCPtr(outData), outData);
  }

  public CkTask EndDecompressBytesENCAsync() {
    long cPtr = chilkatJNI.CkCompression_EndDecompressBytesENCAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndDecompressString(CkString outStr) {
    return chilkatJNI.CkCompression_EndDecompressString(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String endDecompressString() {
    return chilkatJNI.CkCompression_endDecompressString(swigCPtr, this);
  }

  public CkTask EndDecompressStringAsync() {
    long cPtr = chilkatJNI.CkCompression_EndDecompressStringAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean EndDecompressStringENC(CkString outStr) {
    return chilkatJNI.CkCompression_EndDecompressStringENC(swigCPtr, this, CkString.getCPtr(outStr), outStr);
  }

  public String endDecompressStringENC() {
    return chilkatJNI.CkCompression_endDecompressStringENC(swigCPtr, this);
  }

  public CkTask EndDecompressStringENCAsync() {
    long cPtr = chilkatJNI.CkCompression_EndDecompressStringENCAsync(swigCPtr, this);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreCompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_MoreCompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask MoreCompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_MoreCompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreCompressBytesENC(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_MoreCompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String moreCompressBytesENC(CkByteData data) {
    return chilkatJNI.CkCompression_moreCompressBytesENC(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask MoreCompressBytesENCAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_MoreCompressBytesENCAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreCompressString(String str, CkByteData outData) {
    return chilkatJNI.CkCompression_MoreCompressString(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public CkTask MoreCompressStringAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_MoreCompressStringAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreCompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCompression_MoreCompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String moreCompressStringENC(String str) {
    return chilkatJNI.CkCompression_moreCompressStringENC(swigCPtr, this, str);
  }

  public CkTask MoreCompressStringENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_MoreCompressStringENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreDecompressBytes(CkByteData data, CkByteData outData) {
    return chilkatJNI.CkCompression_MoreDecompressBytes(swigCPtr, this, CkByteData.getCPtr(data), data, CkByteData.getCPtr(outData), outData);
  }

  public CkTask MoreDecompressBytesAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_MoreDecompressBytesAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreDecompressBytesENC(String str, CkByteData outData) {
    return chilkatJNI.CkCompression_MoreDecompressBytesENC(swigCPtr, this, str, CkByteData.getCPtr(outData), outData);
  }

  public CkTask MoreDecompressBytesENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_MoreDecompressBytesENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreDecompressString(CkByteData data, CkString outStr) {
    return chilkatJNI.CkCompression_MoreDecompressString(swigCPtr, this, CkByteData.getCPtr(data), data, CkString.getCPtr(outStr), outStr);
  }

  public String moreDecompressString(CkByteData data) {
    return chilkatJNI.CkCompression_moreDecompressString(swigCPtr, this, CkByteData.getCPtr(data), data);
  }

  public CkTask MoreDecompressStringAsync(CkByteData data) {
    long cPtr = chilkatJNI.CkCompression_MoreDecompressStringAsync(swigCPtr, this, CkByteData.getCPtr(data), data);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean MoreDecompressStringENC(String str, CkString outStr) {
    return chilkatJNI.CkCompression_MoreDecompressStringENC(swigCPtr, this, str, CkString.getCPtr(outStr), outStr);
  }

  public String moreDecompressStringENC(String str) {
    return chilkatJNI.CkCompression_moreDecompressStringENC(swigCPtr, this, str);
  }

  public CkTask MoreDecompressStringENCAsync(String str) {
    long cPtr = chilkatJNI.CkCompression_MoreDecompressStringENCAsync(swigCPtr, this, str);
    return (cPtr == 0) ? null : new CkTask(cPtr, true);
  }

  public boolean SaveLastError(String path) {
    return chilkatJNI.CkCompression_SaveLastError(swigCPtr, this, path);
  }

  public boolean UnlockComponent(String unlockCode) {
    return chilkatJNI.CkCompression_UnlockComponent(swigCPtr, this, unlockCode);
  }

}
