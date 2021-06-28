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
  default     = "linuxevangelist/devops:latest"
}

