package com.bytezone.diskbrowser.utilities;

public class FileFormatException extends RuntimeException
{
  String message;

  public FileFormatException (String string)
  {
    this.message = string;
  }

  @Override
  public String toString ()
  {
    return message;
  }
}