/*
 * MIT License
 *
 * Copyright (c) 2024 Nicolas Vannieuwkerke
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice (including the next
 * paragraph) shall be included in all copies or substantial portions of the
 * Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package nextflow.ga4gh.drs.model

import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import java.nio.file.Path
import java.util.UUID

import nextflow.ga4gh.drs.config.DrsConfig

/**
 * Define the AccessMethod object
 *
 * @author Nicolas Vannieuwkerke <nicolas.vannieuwkerke@ugent.be>
 */
@Slf4j
@CompileStatic
class AccessMethod {

    String type
    AccessUrl accessUrl
    String accessId
    String region = ""

    /**
     * Construct a DRS object.
     *
     * @param destPath The URL or path to the destination of the published file
     * @param config The DrsConfig object
     */
    AccessMethod(Path destPath, DrsConfig config) {
        def String protocol = destPath.toUri().toString().split("://")[0]
        if(["s3", "gs", "ftp", "https"].contains(protocol)) {
            // No support for 'gsiftp', 'globus' and 'htsget', implement this later if needed
            this.type = protocol
        } else {
            this.type = "file"
        }
        this.accessUrl = new AccessUrl(destPath, this.type, config)
        this.accessId = UUID.randomUUID().toString()
    }

    /**
     * Transform the object to a map
     *
     */
    public Map toMap() {
        return [
            type: this.type,
            access_url: this.accessUrl.toMap(),
            access_id: this.accessId,
            region: this.region
        ]
    }

}


