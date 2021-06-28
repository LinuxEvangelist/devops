variable "cluster" {
  default = "devops-cluster-development"
}

variable "app" {
  type        = string
  description = "Name of application"
  default     = "devops"
}

variable "zone" {
  default = "us-east1-c"
}

variable "docker-image" {
  type        = string
  description = "name of the docker image to deploy"
  //default     = "gcr.io/copper-triumph-217516/devops:0.0.1-SNAPSHOT"
  default     = "linuxevangelist/devops:latest"
}

