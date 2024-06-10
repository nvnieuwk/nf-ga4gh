/*
 * Copyright 2013-2024, Seqera Labs
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/*
 * Task Execution Service
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package nextflow.ga4gh.tes.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/**
 * Executor describes a command to be executed, and its environment.
 */
@Schema(description = "Executor describes a command to be executed, and its environment.")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2023-08-15T14:10:09.878Z[GMT]")

public class TesExecutor {
  @SerializedName("image")
  private String image = null;

  @SerializedName("command")
  private List<String> command = new ArrayList<String>();

  @SerializedName("workdir")
  private String workdir = null;

  @SerializedName("stdin")
  private String stdin = null;

  @SerializedName("stdout")
  private String stdout = null;

  @SerializedName("stderr")
  private String stderr = null;

  @SerializedName("env")
  private Map<String, String> env = null;

  @SerializedName("ignore_error")
  private Boolean ignoreError = null;

  public TesExecutor image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Name of the container image. The string will be passed as the image argument to the containerization run command. Examples:    - &#x60;ubuntu&#x60;    - &#x60;quay.io/aptible/ubuntu&#x60;    - &#x60;gcr.io/my-org/my-image&#x60;    - &#x60;myregistryhost:5000/fedora/httpd:version1.0&#x60;
   * @return image
  **/
  @Schema(example = "ubuntu:20.04", required = true, description = "Name of the container image. The string will be passed as the image argument to the containerization run command. Examples:    - `ubuntu`    - `quay.io/aptible/ubuntu`    - `gcr.io/my-org/my-image`    - `myregistryhost:5000/fedora/httpd:version1.0`")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public TesExecutor command(List<String> command) {
    this.command = command;
    return this;
  }

  public TesExecutor addCommandItem(String commandItem) {
    this.command.add(commandItem);
    return this;
  }

   /**
   * A sequence of program arguments to execute, where the first argument is the program to execute (i.e. argv). Example: &#x60;&#x60;&#x60; {   \&quot;command\&quot; : [\&quot;/bin/md5\&quot;, \&quot;/data/file1\&quot;] } &#x60;&#x60;&#x60;
   * @return command
  **/
  @Schema(example = "[\"/bin/md5\",\"/data/file1\"]", required = true, description = "A sequence of program arguments to execute, where the first argument is the program to execute (i.e. argv). Example: ``` {   \"command\" : [\"/bin/md5\", \"/data/file1\"] } ```")
  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }

  public TesExecutor workdir(String workdir) {
    this.workdir = workdir;
    return this;
  }

   /**
   * The working directory that the command will be executed in. If not defined, the system will default to the directory set by the container image.
   * @return workdir
  **/
  @Schema(example = "/data/", description = "The working directory that the command will be executed in. If not defined, the system will default to the directory set by the container image.")
  public String getWorkdir() {
    return workdir;
  }

  public void setWorkdir(String workdir) {
    this.workdir = workdir;
  }

  public TesExecutor stdin(String stdin) {
    this.stdin = stdin;
    return this;
  }

   /**
   * Path inside the container to a file which will be piped to the executor&#x27;s stdin. This must be an absolute path. This mechanism could be used in conjunction with the input declaration to process a data file using a tool that expects STDIN.  For example, to get the MD5 sum of a file by reading it into the STDIN &#x60;&#x60;&#x60; {   \&quot;command\&quot; : [\&quot;/bin/md5\&quot;],   \&quot;stdin\&quot; : \&quot;/data/file1\&quot; } &#x60;&#x60;&#x60;
   * @return stdin
  **/
  @Schema(example = "/data/file1", description = "Path inside the container to a file which will be piped to the executor's stdin. This must be an absolute path. This mechanism could be used in conjunction with the input declaration to process a data file using a tool that expects STDIN.  For example, to get the MD5 sum of a file by reading it into the STDIN ``` {   \"command\" : [\"/bin/md5\"],   \"stdin\" : \"/data/file1\" } ```")
  public String getStdin() {
    return stdin;
  }

  public void setStdin(String stdin) {
    this.stdin = stdin;
  }

  public TesExecutor stdout(String stdout) {
    this.stdout = stdout;
    return this;
  }

   /**
   * Path inside the container to a file where the executor&#x27;s stdout will be written to. Must be an absolute path. Example: &#x60;&#x60;&#x60; {   \&quot;stdout\&quot; : \&quot;/tmp/stdout.log\&quot; } &#x60;&#x60;&#x60;
   * @return stdout
  **/
  @Schema(example = "/tmp/stdout.log", description = "Path inside the container to a file where the executor's stdout will be written to. Must be an absolute path. Example: ``` {   \"stdout\" : \"/tmp/stdout.log\" } ```")
  public String getStdout() {
    return stdout;
  }

  public void setStdout(String stdout) {
    this.stdout = stdout;
  }

  public TesExecutor stderr(String stderr) {
    this.stderr = stderr;
    return this;
  }

   /**
   * Path inside the container to a file where the executor&#x27;s stderr will be written to. Must be an absolute path. Example: &#x60;&#x60;&#x60; {   \&quot;stderr\&quot; : \&quot;/tmp/stderr.log\&quot; } &#x60;&#x60;&#x60;
   * @return stderr
  **/
  @Schema(example = "/tmp/stderr.log", description = "Path inside the container to a file where the executor's stderr will be written to. Must be an absolute path. Example: ``` {   \"stderr\" : \"/tmp/stderr.log\" } ```")
  public String getStderr() {
    return stderr;
  }

  public void setStderr(String stderr) {
    this.stderr = stderr;
  }

  public TesExecutor env(Map<String, String> env) {
    this.env = env;
    return this;
  }

  public TesExecutor putEnvItem(String key, String envItem) {
    if (this.env == null) {
      this.env = new HashMap<String, String>();
    }
    this.env.put(key, envItem);
    return this;
  }

   /**
   * Environmental variables to set within the container. Example: &#x60;&#x60;&#x60; {   \&quot;env\&quot; : {     \&quot;ENV_CONFIG_PATH\&quot; : \&quot;/data/config.file\&quot;,     \&quot;BLASTDB\&quot; : \&quot;/data/GRC38\&quot;,     \&quot;HMMERDB\&quot; : \&quot;/data/hmmer\&quot;   } } &#x60;&#x60;&#x60;
   * @return env
  **/
  @Schema(example = "{\"BLASTDB\":\"/data/GRC38\",\"HMMERDB\":\"/data/hmmer\"}", description = "Environmental variables to set within the container. Example: ``` {   \"env\" : {     \"ENV_CONFIG_PATH\" : \"/data/config.file\",     \"BLASTDB\" : \"/data/GRC38\",     \"HMMERDB\" : \"/data/hmmer\"   } } ```")
  public Map<String, String> getEnv() {
    return env;
  }

  public void setEnv(Map<String, String> env) {
    this.env = env;
  }

  public TesExecutor ignoreError(Boolean ignoreError) {
    this.ignoreError = ignoreError;
    return this;
  }

   /**
   * Default behavior of running an array of executors is that execution stops on the first error. If &#x60;ignore_error&#x60; is &#x60;True&#x60;, then the runner will record error exit codes, but will continue on to the next tesExecutor.
   * @return ignoreError
  **/
  @Schema(description = "Default behavior of running an array of executors is that execution stops on the first error. If `ignore_error` is `True`, then the runner will record error exit codes, but will continue on to the next tesExecutor.")
  public Boolean isIgnoreError() {
    return ignoreError;
  }

  public void setIgnoreError(Boolean ignoreError) {
    this.ignoreError = ignoreError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TesExecutor tesExecutor = (TesExecutor) o;
    return Objects.equals(this.image, tesExecutor.image) &&
        Objects.equals(this.command, tesExecutor.command) &&
        Objects.equals(this.workdir, tesExecutor.workdir) &&
        Objects.equals(this.stdin, tesExecutor.stdin) &&
        Objects.equals(this.stdout, tesExecutor.stdout) &&
        Objects.equals(this.stderr, tesExecutor.stderr) &&
        Objects.equals(this.env, tesExecutor.env) &&
        Objects.equals(this.ignoreError, tesExecutor.ignoreError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(image, command, workdir, stdin, stdout, stderr, env, ignoreError);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TesExecutor {\n");
    
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    workdir: ").append(toIndentedString(workdir)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdout: ").append(toIndentedString(stdout)).append("\n");
    sb.append("    stderr: ").append(toIndentedString(stderr)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    ignoreError: ").append(toIndentedString(ignoreError)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
